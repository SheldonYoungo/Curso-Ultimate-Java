package Recursos;

public class Restaurante {
    private Atendible[] meseros;

    public void setMeseros(Atendible[] meseros) {
        this.meseros = meseros;
    }

    public void llevarCerveza () {
        for (var mesero: this.meseros) {
            mesero.atenderMesa();
        }
    }
}
