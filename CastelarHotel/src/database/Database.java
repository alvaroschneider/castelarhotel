package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Database {

    public DefaultTableModel getReservas() throws Exception {
        Connection laConexion = ConnectionManager.getConnection();
        //El siguiente paso es realizar la consulta y obtener el ResultSet. El código es el siguiente
        Statement s = laConexion.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM alura.reservas");
//Para meter los datos en el JTable, usaremos la clase DefaultTableModel. Para ello basta con instanciar el JTable como se muestra en el codigo
        DefaultTableModel modelo = new DefaultTableModel();
//Ahora sólo hay que rellenar el DefaultTableModel con los datos del ResultSet.
// Creamos las columnas.
        modelo.addColumn("Numero de Reserva");
        modelo.addColumn("Fecha Check In");
        modelo.addColumn("Fecha Check Out");
        modelo.addColumn("Valor");
        modelo.addColumn("Forma de Pago");

// Recorremos los registros con un ciclo while
        while (rs.next()) {
            // Se crea un array que será una de las filas de la tabla.
            Object[] fila = new Object[5]; // Hay cinco columnas en la tabla
            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            for (int i = 0; i < 5; i++) {
                fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
            }                                  //No es como en PHP o otros lenguajes donde los indices inician con 0
            // Se añade al modelo la fila completa.
            modelo.addRow(fila);
        }
        return modelo;
    }

    public DefaultTableModel getHuespedes() throws Exception {
        Connection laConexion = ConnectionManager.getConnection();
        //El siguiente paso es realizar la consulta y obtener el ResultSet. El código es el siguiente
        Statement s = laConexion.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM alura.huespedes");
//Para meter los datos en el JTable, usaremos la clase DefaultTableModel. Para ello basta con instanciar el JTable como se muestra en el codigo
        DefaultTableModel modeloHuesped = new DefaultTableModel();
//Ahora sólo hay que rellenar el DefaultTableModel con los datos del ResultSet.
// Creamos las columnas.
        modeloHuesped.addColumn("Número de Huesped");
        modeloHuesped.addColumn("Nombre");
        modeloHuesped.addColumn("Apellido");
        modeloHuesped.addColumn("Fecha de Nacimiento");
        modeloHuesped.addColumn("Nacionalidad");
        modeloHuesped.addColumn("Telefono");
        modeloHuesped.addColumn("Número de Reserva");

// Recorremos los registros con un ciclo while
        while (rs.next()) {
            // Se crea un array que será una de las filas de la tabla.
            Object[] fila = new Object[7]; // Hay cinco columnas en la tabla
            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            for (int i = 0; i < 7; i++) {
                fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
            }                                  //No es como en PHP o otros lenguajes donde los indices inician con 0
            // Se añade al modelo la fila completa.
            modeloHuesped.addRow(fila);
        }
        return modeloHuesped;
    }

    public DefaultTableModel getReservaPorId(String id) throws Exception {
        Connection laConexion = ConnectionManager.getConnection();
        //El siguiente paso es realizar la consulta y obtener el ResultSet. El código es el siguiente
        Statement s = laConexion.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM alura.reservas where id = '" + id + "'");
//Para meter los datos en el JTable, usaremos la clase DefaultTableModel. Para ello basta con instanciar el JTable como se muestra en el codigo
        DefaultTableModel modelo = new DefaultTableModel();
//Ahora sólo hay que rellenar el DefaultTableModel con los datos del ResultSet.
// Creamos las columnas.
        modelo.addColumn("Numero de Reserva");
        modelo.addColumn("Fecha Check In");
        modelo.addColumn("Fecha Check Out");
        modelo.addColumn("Valor");
        modelo.addColumn("Forma de Pago");

// Recorremos los registros con un ciclo while
        while (rs.next()) {
            // Se crea un array que será una de las filas de la tabla.
            Object[] fila = new Object[5]; // Hay cinco columnas en la tabla
            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            for (int i = 0; i < 5; i++) {
                fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
            }                                  //No es como en PHP o otros lenguajes donde los indices inician con 0
            // Se añade al modelo la fila completa.
            modelo.addRow(fila);
        }
        return modelo;
    }
    
    public DefaultTableModel getHuespedPorApellido(String apellido) throws Exception {
        Connection laConexion = ConnectionManager.getConnection();
        //El siguiente paso es realizar la consulta y obtener el ResultSet. El código es el siguiente
        Statement s = laConexion.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM alura.huespedes WHERE apellido = '"+apellido+"'");
//Para meter los datos en el JTable, usaremos la clase DefaultTableModel. Para ello basta con instanciar el JTable como se muestra en el codigo
        DefaultTableModel modeloHuesped = new DefaultTableModel();
//Ahora sólo hay que rellenar el DefaultTableModel con los datos del ResultSet.
// Creamos las columnas.
        modeloHuesped.addColumn("Número de Huesped");
        modeloHuesped.addColumn("Nombre");
        modeloHuesped.addColumn("Apellido");
        modeloHuesped.addColumn("Fecha de Nacimiento");
        modeloHuesped.addColumn("Nacionalidad");
        modeloHuesped.addColumn("Telefono");
        modeloHuesped.addColumn("Número de Reserva");

// Recorremos los registros con un ciclo while
        while (rs.next()) {
            // Se crea un array que será una de las filas de la tabla.
            Object[] fila = new Object[7]; // Hay cinco columnas en la tabla
            // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
            for (int i = 0; i < 7; i++) {
                fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
            }                                  //No es como en PHP o otros lenguajes donde los indices inician con 0
            // Se añade al modelo la fila completa.
            modeloHuesped.addRow(fila);
        }
        return modeloHuesped;
    }
    
}
