import java.util.ArrayList;
import java.util.List;

class Monitor {
    private String nome;
    private String prontuario;
    private List<String> materiasMonitoradas;
    private List<String> horariosDisponiveis;

    public Monitor(String nome, String prontuario) {
        this.nome = nome;
        this.prontuario = prontuario;
        this.materiasMonitoradas = new ArrayList<>();
        this.horariosDisponiveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public List<String> getMateriasMonitoradas() {
        return materiasMonitoradas;
    }

    public void adicionarMateriaMonitorada(String materia) {
        materiasMonitoradas.add(materia);
    }

    public void removerMateriaMonitorada(String materia) {
        materiasMonitoradas.remove(materia);
    }

    public List<String> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void adicionarHorarioDisponivel(String horario) {
        horariosDisponiveis.add(horario);
    }

    public void removerHorarioDisponivel(String horario) {
        horariosDisponiveis.remove(horario);
    }
}