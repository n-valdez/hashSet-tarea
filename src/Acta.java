
public class Acta {

    private int nroActa;
    private int nroTomo;
    private int nroFolio;
    private String nombrePersona;
    private String sexoPersona;
    private int departamento;
    private int costo;

    public Acta(int nroActa, int nroTomo, int nroFolio, String nombrePersona, String sexoPersona, int departamento,
                int costo) {
        super();
        this.nroActa = nroActa;
        this.nroTomo = nroTomo;
        this.nroFolio = nroFolio;
        this.nombrePersona = nombrePersona;
        this.sexoPersona = sexoPersona;
        this.departamento = departamento;
        this.costo = costo;
    }

    public Acta() {

    }

    public int getNroActa() {
        return nroActa;
    }

    public void setNroActa(int nroActa) {
        this.nroActa = nroActa;
    }

    public int getNroTomo() {
        return nroTomo;
    }

    public void setNroTomo(int nroTomo) {
        this.nroTomo = nroTomo;
    }

    public int getNroFolio() {
        return nroFolio;
    }

    public void setNroFolio(int nroFolio) {
        this.nroFolio = nroFolio;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getSexoPersona() {
        return sexoPersona;
    }

    public void setSexoPersona(String sexoPersona) {
        this.sexoPersona = sexoPersona;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public boolean equalsForRemove(Acta otherActa) {
        
        if (departamento != otherActa.departamento) {
            return false;
        }
       
        if (nroActa != otherActa.nroActa) {
            return false;
        }
        if (nroFolio != otherActa.nroFolio) {
            return false;
        }
        if (nroTomo != otherActa.nroTomo) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + costo;
        result = prime * result + departamento;
        result = prime * result + ((nombrePersona == null) ? 0 : nombrePersona.hashCode());
        result = prime * result + nroActa;
        result = prime * result + nroFolio;
        result = prime * result + nroTomo;
        result = prime * result + ((sexoPersona == null) ? 0 : sexoPersona.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Acta other = (Acta) obj;
        if (costo != other.costo)
            return false;
        if (departamento != other.departamento)
            return false;
        if (nombrePersona == null) {
            if (other.nombrePersona != null)
                return false;
        } else if (!nombrePersona.equals(other.nombrePersona))
            return false;
        if (nroActa != other.nroActa)
            return false;
        if (nroFolio != other.nroFolio)
            return false;
        if (nroTomo != other.nroTomo)
            return false;
        if (sexoPersona == null) {
            if (other.sexoPersona != null)
                return false;
        } else if (!sexoPersona.equals(other.sexoPersona))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Acta [nroActa=" + nroActa + ", nroTomo=" + nroTomo + ", nroFolio=" + nroFolio + ", nombrePersona="
                + nombrePersona + ", sexoPersona=" + sexoPersona + ", departamento=" + departamento + ", costo=" + costo
                + "]";
    }

}
