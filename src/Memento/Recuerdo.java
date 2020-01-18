package Memento;

import FactoryAlojaminentos.Alojamiento;
import alojamiento.GestionAlojamientos;
import alojamiento.GestionReservas;
import alojamiento.Reserva;
import alojamiento.Usuario;
import alojamiento.Usuarios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Almacena el estado interno de un objeto Originador.
 *
 */
public class Recuerdo implements Serializable{

    private ArrayList<Alojamiento> alojamientosR;
    private ArrayList<Reserva> reservasR;
    private HashMap<String, Usuario> usuariosR;
    private String ruta;
    private int NgerenteR;
    
    
    public Recuerdo(){
    }

    public Recuerdo(String ruta) {
        this.ruta = ruta;
    }

    public Recuerdo(String ruta, ArrayList<Alojamiento> alojamientosR) {
        this.ruta = ruta;
        this.alojamientosR = alojamientosR;
    }

    public Recuerdo(ArrayList<Reserva> reservasR, String ruta) {
        this.reservasR = reservasR;
        this.ruta = ruta;
    }

    public Recuerdo(HashMap<String, Usuario> usuariosR, int NgerenteR, String ruta) {
        this.usuariosR = usuariosR;
        this.ruta = ruta;
        this.NgerenteR = NgerenteR;
    }

    
    public ArrayList<Alojamiento> getAlojamientosR() {
        return alojamientosR;
    }

    public void setAlojamientosR(ArrayList<Alojamiento> alojamientosR) {
        this.alojamientosR = alojamientosR;
    }

    public ArrayList<Reserva> getReservasR() {
        return reservasR;
    }

    public void setReservasR(ArrayList<Reserva> reservasR) {
        this.reservasR = reservasR;
    }

    public HashMap<String, Usuario> getUsuariosR() {
        return usuariosR;
    }

    public void setUsuariosR(HashMap<String, Usuario> usuariosR) {
        this.usuariosR = usuariosR;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getNgerenteR() {
        return NgerenteR;
    }

    public void setNgerenteR(int NgerenteR) {
        this.NgerenteR = NgerenteR;
    }

    
    
    public static void cargarAlojamientos() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList<Alojamiento> alojamientos;
        try {

            fis = new FileInputStream("./ficheros/alojamientos/alojamientos.dat");
            entrada = new ObjectInputStream(fis);
            alojamientos = (ArrayList<Alojamiento>) entrada.readObject();
            GestionAlojamientos.setAlojamientos(alojamientos);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void guardarAlojamientos() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            
            fos = new FileOutputStream("./ficheros/alojamientos/alojamientos.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(GestionAlojamientos.getAlojamientos());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void cargarReservas() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList<Reserva> reservas;
        try {

            fis = new FileInputStream("./ficheros/reservas/reservas.dat");
            entrada = new ObjectInputStream(fis);
            reservas = (ArrayList<Reserva>) entrada.readObject();
            GestionReservas.setReservas(reservas);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void guardarReservas() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            
            fos = new FileOutputStream("./ficheros/reservas/reservas.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(GestionReservas.getReservas());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void cargarUsuarios() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        HashMap<String, Usuario> usuarios;
        int nGerentes;
        try {

            fis = new FileInputStream("./ficheros/usuarios/usuarios.dat");
            entrada = new ObjectInputStream(fis);
            usuarios = (HashMap<String, Usuario>) entrada.readObject();
            Usuarios.setUsuarios(usuarios);
            
            fis = new FileInputStream("./ficheros/usuarios/nGerentes.dat");
            nGerentes = (int) entrada.readObject();
            Usuarios.setNGerentes(nGerentes);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void guardarUsuarios() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            fos = new FileOutputStream("./ficheros/usuarios/usuarios.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(Usuarios.getUsuarios());
            
            fos = new FileOutputStream("./ficheros/usuarios/nGerentes.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(Usuarios.getNGerentes());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
