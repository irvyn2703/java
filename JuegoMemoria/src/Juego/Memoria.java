
// package Juego;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.swing.*;

public class Memoria implements ActionListener {
    // atributos
    JFrame ventana;
    // presentacion
    JPanel panelPresentacion;
    JLabel fondoPresentacion;
    JLabel BotonJugar;
    JLabel Bienvenido;
    // juego
    JPanel panelJuego;
    JLabel fondoJuego;
    JLabel matriz[][];
    int mat[][];
    int matAux[][];
    String jugador;
    Random aleatorio;
    JLabel nombreJugador;
    Timer tiempo;
    JLabel cronometro;
    JButton verMejores;
    int min;
    int seg;
    int contador;
    Timer tiempoEspera;
    int contSegEsp;
    Timer tiempoEspera1;
    int ban;
    int ban1;

    int antnum;
    int antx;
    int anty;
    int actualnum;
    int actualx;
    int actualy;

    // Marcadores
    Marcador marcador = new Marcador();

    // constructor
    public Memoria() {

        // cargar el objeto
        try {
            InputStream is = new FileInputStream("Marcador.bin");
            ObjectInputStream ois = new ObjectInputStream(is);
            
            marcador = (Marcador) ois.readObject();

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error -> " + e.getMessage());
        }

        // ventana
        ventana = new JFrame("Memorama");
        ventana.setSize(1300, 750);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        // Jpanel presentacion
        panelPresentacion = new JPanel();
        panelPresentacion.setSize(ventana.getWidth(), ventana.getHeight());
        panelPresentacion.setLocation(0, 0);
        panelPresentacion.setLayout(null);
        panelPresentacion.setVisible(true);

        // fondo de presentacion
        fondoPresentacion = new JLabel();
        fondoPresentacion.setSize(ventana.getWidth(), ventana.getHeight());
        fondoPresentacion.setLocation(0, 0);
        fondoPresentacion.setIcon(new ImageIcon("imagenes/fondop.png"));
        fondoPresentacion.setVisible(true);
        panelPresentacion.add(fondoPresentacion, 0);

        // boton de jugar
        BotonJugar = new JLabel();
        BotonJugar.setSize(331, 209);
        BotonJugar.setLocation(500, 400);
        BotonJugar.setIcon(new ImageIcon("imagenes/jugar.png"));
        BotonJugar.setVisible(true);
        panelPresentacion.add(BotonJugar, 0);

        // Jpanel juego
        panelJuego = new JPanel();
        panelJuego.setSize(ventana.getWidth(), ventana.getHeight());
        panelJuego.setLocation(0, 0);
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);

        // fondo de juego
        fondoJuego = new JLabel();
        fondoJuego.setSize(ventana.getWidth(), ventana.getHeight());
        fondoJuego.setLocation(0, 0);
        fondoJuego.setIcon(new ImageIcon("imagenes/fondo2.png"));
        fondoJuego.setVisible(true);
        panelJuego.add(fondoJuego, 0);

        // nombre del jugador
        nombreJugador = new JLabel();
        nombreJugador.setSize(150, 20);
        nombreJugador.setLocation(100, 10);
        nombreJugador.setForeground(Color.WHITE);
        nombreJugador.setVisible(true);
        panelJuego.add(nombreJugador, 0);

        // ver mejores
        verMejores = new JButton("ver mejores");
        verMejores.setBounds((ventana.getWidth()/2) -60, 10, 120, 20);
        verMejores.setVisible(true);
        panelJuego.add(verMejores);
        verMejores.addActionListener(this);

        // nombre del jugador
        cronometro = new JLabel();
        cronometro.setSize(150, 20);
        cronometro.setLocation(ventana.getWidth() - 200, 10);
        cronometro.setForeground(Color.WHITE);
        cronometro.setVisible(true);
        panelJuego.add(cronometro, 0);

        // matriz logica
        mat = new int[3][8];
        matAux = new int[3][8];
        aleatorio = new Random();
        this.Aleatorio();

        // matriz de imagenes
        matriz = new JLabel[3][8];
        // genera las cartas 3*8 = 24
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = new JLabel();
                // posisiona la carta
                matriz[i][j].setBounds(10 + (j * 161), 40 + (i * 225), 161, 225);
                matriz[i][j].setIcon(new ImageIcon("imagenes/" + matAux[i][j] + ".png"));
                matriz[i][j].setVisible(true);
                // agrega la carta
                panelJuego.add(matriz[i][j], 0);
            }
        }

        // tiempo
        min = 0;
        seg = 0;

        tiempo = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seg++;
                if (seg == 60) {
                    min++;
                    seg = 0;
                }
                cronometro.setText("tiempo: " + min + ":" + seg);
            }
        });

        // tiempo de espera
        contSegEsp = 0;
        tiempoEspera = new Timer(350, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contSegEsp++;
            }
        });
        tiempoEspera.start();
        tiempoEspera.stop();
        contSegEsp = 0;
        ban = 0;
        ban1 = 0;
        // evento de clic de las cartas

        contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                // agregar el evento a cada carta
                matriz[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 8; l++) {
                                if (e.getSource() == matriz[k][l]) {
                                    if (matAux[k][l] == 0 && contador != 2) {
                                        matAux[k][l] = mat[k][l];
                                        matriz[k][l].setIcon(new ImageIcon("imagenes/" + matAux[k][l] + ".png"));
                                        contador++;
                                        actualnum = mat[k][l];
                                        actualx = k;
                                        actualy = l;

                                        if (contador == 1) {
                                            antnum = mat[k][l];
                                            antx = k;
                                            anty = l;
                                        }

                                        tiempoEspera1 = new Timer(500, new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                if (contador == 2 && ban1 == 0) {
                                                    tiempoEspera.restart();
                                                    ban1 = 1;
                                                }
                                                if (contador == 2 && contSegEsp == 2) {
                                                    tiempoEspera.stop();
                                                    contSegEsp = 0;
                                                    if (matAux[actualx][actualy] == matAux[antx][anty]) {
                                                        matAux[actualx][actualy] = -1;
                                                        matAux[antx][anty] = -1;
                                                        matriz[actualx][actualy].setIcon(new ImageIcon(
                                                                "imagenes/" + matAux[actualx][actualy] + ".png"));
                                                        matriz[antx][anty].setIcon(new ImageIcon(
                                                                "imagenes/" + matAux[antx][anty] + ".png"));
                                                        contador = 0;
                                                        // ganar
                                                        int acum = 0;
                                                        for (int m = 0; m < 3; m++) {
                                                            for (int n = 0; n < 8; n++) {
                                                                if (matAux[m][n] == -1)
                                                                    acum++;
                                                            }
                                                        }
                                                        if (acum == 24) {
                                                            tiempo.stop();
                                                            JOptionPane.showMessageDialog(ventana,
                                                                    "Has Terminado, este es tu tiempo: " + min + ":"
                                                                            + seg);

                                                            marcador.agregar(jugador, min, seg);
                                                            marcador.obtenerMinimo();
                                                            marcador.ingresarMejores();
                                                            marcador.quicksort(marcador.segundosTotales,0, marcador.cont-1);
                                                            for (int i = 0; i < marcador.cont;i++)
                                                            System.out.println((i+1) + marcador.segundosTotales[i]);

                                                            // guarda el archivo
                                                            Archivo();

                                                            // reinicia el juego
                                                            for (int m = 0; m < 3; m++) {
                                                                for (int n = 0; n < 8; n++) {
                                                                    mat[m][n] = 0;
                                                                    matAux[m][n] = 0;
                                                                    matriz[m][n].setIcon(new ImageIcon(
                                                                            "imagenes/" + matAux[m][n] + ".png"));
                                                                }
                                                            }
                                                            Aleatorio();
                                                            min = 0;
                                                            seg = 0;
                                                            tiempo.restart();

                                                            panelPresentacion.setVisible(true);
                                                            ventana.remove(panelJuego);
                                                            tiempo.stop();
                                                        }
                                                    }

                                                    for (int m = 0; m < 3; m++) {
                                                        for (int n = 0; n < 8; n++) {
                                                            System.out.print(matAux[m][n] + " ");
                                                            if (matAux[m][n] != 0 && matAux[m][n] != -1) {
                                                                matAux[m][n] = 0;
                                                                matriz[m][n].setIcon(new ImageIcon(
                                                                        "imagenes/" + matAux[m][n] + ".png"));
                                                                contador = 0;
                                                            }
                                                        }
                                                        System.out.println("");
                                                    }
                                                    tiempoEspera1.stop();
                                                    ban1 = 0;
                                                }
                                            }
                                        });

                                        if (ban == 0) {
                                            tiempoEspera1.start();
                                            ban = 1;
                                        }
                                        if (contador == 2)
                                            tiempoEspera1.restart();
                                    }
                                }
                            }
                        }
                    }
                });

            }
        }

        BotonJugar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                jugador = JOptionPane.showInputDialog(ventana, "Nombre del jugador", "Escribe...");
                while (jugador == null || jugador.compareTo("Escribe...") == 0 || jugador.compareTo("") == 0) {
                    jugador = JOptionPane.showInputDialog(ventana, "Debes escribir tu nombre", "Escribe...");
                }
                nombreJugador.setText("Jugador: " + jugador);
                tiempo.start();
                panelPresentacion.setVisible(false);
                ventana.add(panelJuego);
                panelJuego.setVisible(true);

            }
        });

        ventana.add(panelPresentacion);
        ventana.setVisible(true);
    }

    public void Archivo() {
        // guarda un txt
        try {
            FileWriter Registro = new FileWriter("Jugadores.txt", true);
            Registro.write("JUGADOR: " + jugador + " Tiempo: " + min + ":" + seg + "\n");
            Registro.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // guarda el objeto
        try {
            OutputStream os = new FileOutputStream("Marcador.bin");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            
            oos.writeObject(marcador);
            
            oos.close();
            
            System.out.println("La escritura se ha completado.");
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }

    public void Aleatorio() {

        int acumulador = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 8; j++) {
                mat[i][j] = 0;
                matAux[i][j] = 0;
            }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                mat[i][j] = aleatorio.nextInt(12) + 1;
                do {
                    acumulador = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (mat[i][j] == mat[k][l]) {
                                acumulador += 1;
                            }
                        }
                    }
                    if (acumulador == 3) {
                        mat[i][j] = aleatorio.nextInt(12) + 1;
                    }
                } while (acumulador == 3);
            }
        }
    }

    public String verM() {
        String m = "";
        for (int i = 0; i <= marcador.cont-1; i++) {
            m += (i + 1) + ".-" + marcador.nombres[i] + "= " + marcador.minutos[i] + ":" + marcador.segundos[i];
            if (i == 0) {
                m += "      " + "ultimo jugardor";
            }
            if (i == 1) {
                m += "      " + marcador.nombreU + "= " + marcador.minuto + ":" + marcador.segundo;
            }
            m += "\n";
        }
        return m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == verMejores) {
            JOptionPane.showMessageDialog(null, verM());
        }
    }
}