package com.java.cube.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Heroes", schema = "dbo", catalog = "CubeJava")
public class HeroesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "PassWord")
    private double passWord;
    @Basic
    @Column(name = "PhoneNumber")
    private int phoneNumber;
    @Basic
    @Column(name = "Accidenttype1")
    private int accidenttype1;
    @Basic
    @Column(name = "Accidenttype2")
    private Integer accidenttype2;
    @Basic
    @Column(name = "Accidenttype3")
    private Integer accidenttype3;

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

    public double getPassWord() {
        return passWord;
    }

    public void setPassWord(double passWord) {
        this.passWord = passWord;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccidenttype1() {
        return accidenttype1;
    }

    public void setAccidenttype1(int accidenttype1) {
        this.accidenttype1 = accidenttype1;
    }

    public Integer getAccidenttype2() {
        return accidenttype2;
    }

    public void setAccidenttype2(Integer accidenttype2) {
        this.accidenttype2 = accidenttype2;
    }

    public Integer getAccidenttype3() {
        return accidenttype3;
    }

    public void setAccidenttype3(Integer accidenttype3) {
        this.accidenttype3 = accidenttype3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeroesEntity that = (HeroesEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.passWord, passWord) != 0) return false;
        if (phoneNumber != that.phoneNumber) return false;
        if (accidenttype1 != that.accidenttype1) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (accidenttype2 != null ? !accidenttype2.equals(that.accidenttype2) : that.accidenttype2 != null)
            return false;
        if (accidenttype3 != null ? !accidenttype3.equals(that.accidenttype3) : that.accidenttype3 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(passWord);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + phoneNumber;
        result = 31 * result + accidenttype1;
        result = 31 * result + (accidenttype2 != null ? accidenttype2.hashCode() : 0);
        result = 31 * result + (accidenttype3 != null ? accidenttype3.hashCode() : 0);
        return result;
    }
}
