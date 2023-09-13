public class Main {
    public static void main(String[] args) {
        MonitorController controller = new MonitorController();

        Monitor monitor1 = new Monitor("João", "12345");
        monitor1.adicionarMateriaMonitorada("Matemática");
        monitor1.adicionarHorarioDisponivel("Segunda às 10:00");
        controller.adicionarMonitor(monitor1);

        Monitor monitor2 = new Monitor("Maria", "54321");
        monitor2.adicionarMateriaMonitorada("Física");
        monitor2.adicionarHorarioDisponivel("Terça às 14:00");
        controller.adicionarMonitor(monitor2);

 
        Monitor monitorEncontrado = controller.getMonitor("12345");
        if (monitorEncontrado != null) {
            System.out.println("Monitor encontrado: " + monitorEncontrado.getNome());
        }

        Monitor novoMonitor = new Monitor("José", "12345");
        novoMonitor.adicionarMateriaMonitorada("Química");
        novoMonitor.adicionarHorarioDisponivel("Quarta às 16:00");
        controller.atualizarMonitor("12345", novoMonitor);

        controller.removerMonitor("54321");
    }
}