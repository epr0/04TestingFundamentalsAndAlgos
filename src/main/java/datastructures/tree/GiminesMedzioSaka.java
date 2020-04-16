package datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class GiminesMedzioSaka<String>{
    private String vardas = null;
    private List<GiminesMedzioSaka> vaikai = new ArrayList<>();
    private GiminesMedzioSaka tevas = null;

    //konstruktorius
    public GiminesMedzioSaka(String vardas) {
        this.vardas = vardas;
    }

    //priskyrimo funkcija arba seteris
    public void priskirtiVaika(GiminesMedzioSaka vaikas) {
        vaikas.priskirtiTeva(this);
        this.vaikai.add(vaikas);
    }

    public void priskirtiVaika(String vardas) {
        GiminesMedzioSaka<String> naujasVaikas = new GiminesMedzioSaka<>(vardas);
        this.priskirtiVaika(naujasVaikas);
    }

    public void priskirtiVaikus(List<GiminesMedzioSaka> vaikai) {
        for(GiminesMedzioSaka vaikas : vaikai) {
            vaikas.priskirtiTeva(this);
        }
        this.vaikai.addAll(vaikai);
    }

    public List<GiminesMedzioSaka> gautiVaikuSarasa() {
        return vaikai;
    }

    public String gautiVarda() {
        return vardas;
    }

    public void priskirtiVarda(String vardas) {
        this.vardas = vardas;
    }

    private void priskirtiTeva(GiminesMedzioSaka tevas) {
        this.tevas = tevas;
    }

    public GiminesMedzioSaka gautiTeva() {
        return tevas;
    }
}