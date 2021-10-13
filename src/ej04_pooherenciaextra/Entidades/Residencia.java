/*
cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo
 */
package ej04_pooherenciaextra.Entidades;

 public class Residencia extends ExtraHotelero {
     
     private Integer habResidencia;
     private boolean descGremio;
     private boolean campoDeporte;

    public Residencia() {
    }

    public Residencia(Integer habResidencia, boolean descGremio, boolean campoDeporte) {
        this.habResidencia = habResidencia;
        this.descGremio = descGremio;
        this.campoDeporte = campoDeporte;
    }

    public Residencia(Integer habResidencia, boolean descGremio, boolean campoDeporte, boolean privado, float metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.habResidencia = habResidencia;
        this.descGremio = descGremio;
        this.campoDeporte = campoDeporte;
    }

    public Integer getHabResidencia() {
        return habResidencia;
    }

    public void setHabResidencia(Integer habResidencia) {
        this.habResidencia = habResidencia;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampoDeporte() {
        return campoDeporte;
    }

    public void setCampoDeporte(boolean campoDeporte) {
        this.campoDeporte = campoDeporte;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Residencia{" + "habResidencia=" + habResidencia + ", descGremio=" + descGremio + ", campoDeporte=" + campoDeporte + super.toString()+ '}';
    }
     
    public Residencia crearResidencia(){
        descGremio=false;
        campoDeporte=false;
        String op="";
        super.crearAlojamiento();
        super.crearExtraHotelero();
        System.out.println("Habitaciones??  ");
        habResidencia=sc.nextInt();
        do {
        System.out.println("Descuento Gremial SI / NO");
        op = sc.next();
         if (op.equalsIgnoreCase("si")){
             descGremio=true;
         }
        if((!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"))){
            System.out.println("Digite SI o NO ");
        }           
        }while (!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"));
        
        do {
        System.out.println("Campo de deportes SI / NO");
        op = sc.next();
         if (op.equalsIgnoreCase("si")){
             campoDeporte=true;
         }
        if((!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"))){
            System.out.println("Digite SI o NO ");
        }           
        }while (!op.equalsIgnoreCase("si")&&!op.equalsIgnoreCase("no"));
        
        
        return new Residencia(habResidencia, descGremio, campoDeporte, privado, metrosCuadrados);
    }
     
    
}
