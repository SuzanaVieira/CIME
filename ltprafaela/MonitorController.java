import java.util.ArrayList;
import java.util.List;

class MonitorController {
    private List<Monitor> monitors;

    public MonitorController() {
        this.monitors = new ArrayList<>();
    }

    public void adicionarMonitor(Monitor monitor) {
        monitors.add(monitor);
    }

    public Monitor getMonitor(String prontuario) {
        for (Monitor monitor : monitors) {
            if (monitor.getProntuario().equals(prontuario)) {
                return monitor;
            }
        }
        return null;
    }

    public void atualizarMonitor(String prontuario, Monitor novoMonitor) {
        Monitor monitorExistente = getMonitor(prontuario);
        if (monitorExistente != null) {
            monitorExistente.setNome(novoMonitor.getNome());
            monitorExistente.setProntuario(novoMonitor.getProntuario());
            monitorExistente.getMateriasMonitoradas().clear();
            monitorExistente.getMateriasMonitoradas().addAll(novoMonitor.getMateriasMonitoradas());
            monitorExistente.getHorariosDisponiveis().clear();
            monitorExistente.getHorariosDisponiveis().addAll(novoMonitor.getHorariosDisponiveis());
        }
    }

    public void removerMonitor(String prontuario) {
        Monitor monitorExistente = getMonitor(prontuario);
        if (monitorExistente != null) {
            monitors.remove(monitorExistente);
        }
    }
}