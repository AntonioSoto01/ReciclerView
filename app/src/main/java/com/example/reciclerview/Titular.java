package com.example.reciclerview;

public class Titular {
    private String titulo;
    private String subtitulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public Titular(String titulo, String subtitulo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
}
