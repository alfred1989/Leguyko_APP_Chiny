package com.example.demofirebasetorecycler;

public class model {
    String producent, gatunek_lac, nazwa_towaru, odmiana, kolor_EN, grupa_EN, podgrupa_EN,szacowany_plon,obecność_off,procent_off,opis,plantacja_typowa,uwagi,
            partia,nr_reprodukcji,id_plantacji,komentarz_po_polsku,opis_po_polsku,symbol
            ,purl;

    model() {
    }

    public model(String producent, String gatunek_lac, String nazwa_towaru, String odmiana, String kolor_EN, String grupa_EN, String podgrupa_EN, String szacowany_plon, String obecność_off, String procent_off, String opis, String plantacja_typowa, String uwagi, String partia, String nr_reprodukcji, String id_plantacji, String komentarz_po_polsku, String opis_po_polsku, String symbol, String purl) {
        this.producent = producent;
        this.gatunek_lac = gatunek_lac;
        this.nazwa_towaru = nazwa_towaru;
        this.odmiana = odmiana;
        this.kolor_EN = kolor_EN;
        this.grupa_EN = grupa_EN;
        this.podgrupa_EN = podgrupa_EN;
        this.szacowany_plon = szacowany_plon;
        this.obecność_off = obecność_off;
        this.procent_off = procent_off;
        this.opis = opis;
        this.plantacja_typowa = plantacja_typowa;
        this.uwagi = uwagi;
        this.partia = partia;
        this.nr_reprodukcji = nr_reprodukcji;
        this.id_plantacji = id_plantacji;
        this.komentarz_po_polsku = komentarz_po_polsku;
        this.opis_po_polsku = opis_po_polsku;
        this.symbol = symbol;
        this.purl = purl;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getGatunek_lac() {
        return gatunek_lac;
    }

    public void setGatunek_lac(String gatunek_lac) {
        this.gatunek_lac = gatunek_lac;
    }

    public String getNazwa_towaru() {
        return nazwa_towaru;
    }

    public void setNazwa_towaru(String nazwa_towaru) {
        this.nazwa_towaru = nazwa_towaru;
    }

    public String getOdmiana() {
        return odmiana;
    }

    public void setOdmiana(String odmiana) {
        this.odmiana = odmiana;
    }

    public String getKolor_EN() {
        return kolor_EN;
    }

    public void setKolor_EN(String kolor_EN) {
        this.kolor_EN = kolor_EN;
    }

    public String getGrupa_EN() {
        return grupa_EN;
    }

    public void setGrupa_EN(String grupa_EN) {
        this.grupa_EN = grupa_EN;
    }

    public String getPodgrupa_EN() {
        return podgrupa_EN;
    }

    public void setPodgrupa_EN(String podgrupa_EN) {
        this.podgrupa_EN = podgrupa_EN;
    }

    public String getSzacowany_plon() {
        return szacowany_plon;
    }

    public void setSzacowany_plon(String szacowany_plon) {
        this.szacowany_plon = szacowany_plon;
    }

    public String getObecność_off() {
        return obecność_off;
    }

    public void setObecność_off(String obecność_off) {
        this.obecność_off = obecność_off;
    }

    public String getProcent_off() {
        return procent_off;
    }

    public void setProcent_off(String procent_off) {
        this.procent_off = procent_off;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getPlantacja_typowa() {
        return plantacja_typowa;
    }

    public void setPlantacja_typowa(String plantacja_typowa) {
        this.plantacja_typowa = plantacja_typowa;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    public String getPartia() {
        return partia;
    }

    public void setPartia(String partia) {
        this.partia = partia;
    }

    public String getNr_reprodukcji() {
        return nr_reprodukcji;
    }

    public void setNr_reprodukcji(String nr_reprodukcji) {
        this.nr_reprodukcji = nr_reprodukcji;
    }

    public String getId_plantacji() {
        return id_plantacji;
    }

    public void setId_plantacji(String id_plantacji) {
        this.id_plantacji = id_plantacji;
    }

    public String getKomentarz_po_polsku() {
        return komentarz_po_polsku;
    }

    public void setKomentarz_po_polsku(String komentarz_po_polsku) {
        this.komentarz_po_polsku = komentarz_po_polsku;
    }

    public String getOpis_po_polsku() {
        return opis_po_polsku;
    }

    public void setOpis_po_polsku(String opis_po_polsku) {
        this.opis_po_polsku = opis_po_polsku;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
