/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.básico;

/**
 *
 * @author sbong
 */
public class UMLBásico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        //ejercicio 1
        
        Titular titular = new Titular("Homero Simpson", "30123456");
        Pasaporte pasaporte = new Pasaporte("A123456", "2024-10-01", "foto_homer.jpg", "JPG");
        
        titular.setPasaporte(pasaporte);
   
        titular.mostrar();
        System.out.println();
        pasaporte.mostrar();
           
               
        //ejercicio 2

        Bateria bateria = new Bateria("Li-ion", 4000);
        Celular celular = new Celular("123456789012345", "Nokia", "1100", bateria);
        Usuario usuario = new Usuario("Carl Carlson", "40123456");
        
        usuario.setCelular(celular);
        
        usuario.mostrar();
        System.out.println();
        celular.mostrar();
        System.out.println();
        bateria.mostrar();


        //ejercicio 3

        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Av. Corrientes 1234, Buenos Aires");
        Libro libro = new Libro("Cien años de soledad", "978-0307474728", autor, editorial);
        
        libro.mostrar();

  
        //ejercicio 4

        Banco banco = new Banco("Santander Rio", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/25", banco);
        Cliente cliente = new Cliente("Lenny Leonard", "35123456");
        
        cliente.setTarjeta(tarjeta);
        
        cliente.mostrar();
        System.out.println();
        tarjeta.mostrar();
        System.out.println();
        banco.mostrar();
     
        
        //ejercicio 5

        Computadora computadora = new Computadora("Dell", "SN123456789", "ASUS Prime B450", "AMD B450");
        Propietario propietario = new Propietario("Wanylon Smithers", "40111222");
        
        propietario.setComputadora(computadora);
        
        propietario.mostrar();
        System.out.println();
        computadora.mostrar();

        
        //ejercicio 6
        
//        Cliente2 cliente = new Cliente2("Seymour Skinner", "11-1234-5678");
//        Mesa mesa = new Mesa(5, 4);
//        Reserva reserva = new Reserva("2024-10-15", "20:30", cliente, mesa);
//        
//        reserva.mostrar();
//    }
    
        //ejercicio 7
        
//        Motor motor = new Motor("Nafta 1.6L", "MTR-2024-001");
//        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);
//        Conductor conductor = new Conductor("Marge Simpson", "B12345678");
//
//        conductor.setVehiculo(vehiculo);
//
//        conductor.mostrar();
//        System.out.println();
//        vehiculo.mostrar();
//        System.out.println();
//        motor.mostrar();
//        
//        Motor nuevoMotor = new Motor("Diésel 2.0L", "MTR-2024-002");
//        vehiculo.cambiarMotor(nuevoMotor);
//        vehiculo.mostrar();
//        
//        motor.mostrar();
//    }
        
        //ejercicio 8
        
//        Usuario2 usuario = new Usuario2("Dr. Nick Riviera", "nriviera@hospital.com");
//        Documento documento = new Documento("Informe Médico", "Paciente en buen estado de salud...", "hash_informe_medico_123", "2024-10-15", usuario);
//        
//        documento.mostrar();
//        
//        boolean integro = documento.verificarIntegridad();
//        System.out.println("Documento íntegro: " + integro);
//
//        Usuario2 mismoUsuario = new Usuario2("Dr. Nick Riviera", "nriviera@hospital.com");
//        Documento otroDocumento = new Documento("Receta Médica", "Paracetamol 500mg", "hash_receta_456", "2024-10-15", mismoUsuario);
//        otroDocumento.mostrar();
//    }
        
        
        //ejercicio 9
        
//        Paciente paciente = new Paciente("Bart Simpson", "OSDE");
//        Profesional profesional = new Profesional("Dr. Julius Hibbert", "Cardiología");
//        CitaMedica cita = new CitaMedica("2024-10-20", "10:30", paciente, profesional);
//        
//        cita.mostrar();
//        
//        cita.reprogramar("2024-10-25", "11:00");
//        cita.mostrar();
//    }
        
        //ejercicio 10
        
//        CuentaBancaria cuenta = new CuentaBancaria("0720123456789012345678", 50000.0, "1234", "2024-01-15");
//        Titular2 titular = new Titular2("Joe Quimby", "35123456");
//        
//        titular.setCuentaBancaria(cuenta);
//        
//        cuenta.mostrar();
//        
//        cuenta.depositar(15000.0);
//        cuenta.retirar(10000.0, "1234");
//        cuenta.retirar(5000.0, "0000");
//        
//        cuenta.cambiarClave("1234", "5678", "2024-10-15");
//        cuenta.mostrar();
//        
//    }
        
        //ejercicio 11
//        
//        Artista artista = new Artista("AC/DC", "Rock");
//        Cancion cancion = new Cancion("TNT", artista);
//        Reproductor reproductor = new Reproductor("Spotify");
//
//        artista.mostrar();
//        cancion.mostrar();
//        reproductor.mostrarInfo();
//        
//        reproductor.reproducir(cancion);
//        reproductor.pausar(cancion);
//        
//        Cancion otraCancion = new Cancion("Shoot To Thrill", artista);
//        reproductor.reproducir(otraCancion);       
//    }
    
        //ejercicio 12
        
//        Contribuyente contribuyente = new Contribuyente("Empresa PEPE S.A.", "30-12345678-9");
//        Impuesto impuesto = new Impuesto(100000.0, contribuyente);
//        Calculadora calculadora = new Calculadora("Calculadora Fiscal");
//        
//        contribuyente.mostrar();
//        impuesto.mostrar();
//        calculadora.mostrarInfo();
//        
//        calculadora.calcular(impuesto);
//        calculadora.calcularInteres(impuesto, 30, 0.01);
//
//        Contribuyente otroContribuyente = new Contribuyente("Empresa Pérez e Hijos", "20-87654321-0");
//        Impuesto otroImpuesto = new Impuesto(50000.0, otroContribuyente);
//        
//        calculadora.calcular(otroImpuesto);
//      
//        impuesto.setMonto(150000.0);
//        calculadora.calcular(impuesto);
//    }
        
        //ejercicio 13
        
//        Usuario usuario = new Usuario("Cosme Fulanito", "cosme.f@empresa.com");
//        GeneradorQR generador = new GeneradorQR("v2.1");
//        
//        usuario.mostrar();
//        generador.mostrarInfo();
//        
//    }
        
        //ejercicio 14
        
//        Proyecto proyecto = new Proyecto("Documental Naturaleza", 60);
//        EditorVideo editor = new EditorVideo("Adobe Premiere Pro 2024");
//        
//        proyecto.mostrar();
//        editor.mostrarInfo();
//
//        editor.exportar("MP4", proyecto);
//        
//        String[] formatos = {"AVI", "MOV", "WMV", "MKV"};
//        editor.exportarMultipleFormatos(formatos, proyecto);
//        
//        editor.previsualizar(proyecto);
//        
//        Proyecto otroProyecto = new Proyecto("Cortometraje Artistico", 15);
//        editor.exportar("MOV", otroProyecto);
//        
//    }
}
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
}
