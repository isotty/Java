package com.java.cube.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Sos", schema = "dbo", catalog = "CubeJava")
public class SosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Place")
    private String place;
    @Basic
    @Column(name = "Accidenttype")
    private int accidenttype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAccidenttype() {
        return accidenttype;
    }

    public void setAccidenttype(int accidenttype) {
        this.accidenttype = accidenttype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SosEntity sosEntity = (SosEntity) o;

        if (id != sosEntity.id) return false;
        if (accidenttype != sosEntity.accidenttype) return false;
        if (place != null ? !place.equals(sosEntity.place) : sosEntity.place != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + accidenttype;
        return result;
    }
}
