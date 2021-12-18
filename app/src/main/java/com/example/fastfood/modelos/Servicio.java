package com.example.fastfood.modelos;

public class Servicio {
    private int id;
    private String name;
    private String description;
    private String telefono;
    private byte[] image;

    public Servicio(int id, String name, String description, String telefono, byte[] image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.telefono = telefono;
        this.image = image;
    }

    public Servicio() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
