/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev.Entity;

/**
 *
 * @author ASUS
 */
public class categorief {
    private int idf;
    private String nomc ;

    public categorief(int idf, String nomc) {
        this.idf = idf;
        this.nomc = nomc;
    }

    public categorief() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idf;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final categorief other = (categorief) obj;
        if (this.idf != other.idf) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "categorief{" + "idf=" + idf + ", nomc=" + nomc + '}';
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public String getNomc() {
        return nomc;
    }

    public void setNomc(String nomc) {
        this.nomc = nomc;
    }
    
}
