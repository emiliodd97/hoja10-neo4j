/* 
Universidad del Valle de Guatemala
Algoritmos y estructuras de datos
Hoja de trabajo 10
Rodrigo Barrios, carné 15009
Juan Andrés García - 15046
José Luis Méndez - 15024
Christian Morales - 15015

Main.java

Este programa recoje la cantidad de correos enviados entre 14 empleados de una empresa de software y lo ordena en una estructura de grafo.
Esta estructura sirve para determinar los empleados que están más conectados entre sí y los que se mantienen más  aislados.
*/
import java.io.File;
import org.neo4j.cypher.internal.ExecutionEngine;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.logging.LogProvider;

public class Main {
    
    //Se crea una enumeración tipo nodo que implementa a Label
    public enum NodeType implements Label{
        Persona;
    }
    //Se crea una enumeración tipo relación que implementa a Label
    public enum RelationType implements RelationshipType{
        Correos;
    }
    
    public static void main(String[] args) {
        //Se crea una fabrica para crear bases de datos
        GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
        //Se obtiene la dirección de la base de datos, esta cambia en cada computadora:
        File directorio = new File("C:\\Users\\Rodrigo\\Documents\\Neo4j\\default.graphdb");
        //Se utiliza el objeto tipo file para ingresar al archivo del grafo
        GraphDatabaseService graphDb = dbFactory.newEmbeddedDatabase(directorio);
        /*
        Esto que está aquí lo iba a poner para que se eliminara todo de la base de datos desde el principio,
        si pueden busquen como arreglarlo que a mi no me salio:
        
        LogProvider logProvider = new LogProvider()
        ExecutionEngine engine = new ExecutionEngine(graphDb,logProvider);
        ExecutionResult result;
        */
        
        
        //Se intenta realizar una transacción u operación en Neo4j
        try (Transaction tx = graphDb.beginTx()){
            
            //Se crean los nodos para cada empleado, todos son de tipo persona
            Node Per1 = graphDb.createNode(NodeType.Persona);
            //Número de identifiación del empleado
            Per1.setProperty("Id",1);
            //Nombre del empleado
            Per1.setProperty("Nombre", "Persona 1");
            
            Node Per2 = graphDb.createNode(NodeType.Persona);
            Per2.setProperty("Id",2);
            Per2.setProperty("Nombre", "Persona 2");
            
            Node Per3 = graphDb.createNode(NodeType.Persona);
            Per3.setProperty("Id",3);
            Per3.setProperty("Nombre", "Persona 3");
            
            Node Per4 = graphDb.createNode(NodeType.Persona);
            Per4.setProperty("Id",4);
            Per4.setProperty("Nombre", "Persona 4");
            
            Node Per5 = graphDb.createNode(NodeType.Persona);
            Per5.setProperty("Id",5);
            Per5.setProperty("Nombre", "Persona 5");
            
            Node Per6 = graphDb.createNode(NodeType.Persona);
            Per6.setProperty("Id",6);
            Per6.setProperty("Nombre", "Persona 6");
            
            Node Per7 = graphDb.createNode(NodeType.Persona);
            Per7.setProperty("Id",7);
            Per7.setProperty("Nombre", "Persona 7");
            
            Node Per8 = graphDb.createNode(NodeType.Persona);
            Per8.setProperty("Id",8);
            Per8.setProperty("Nombre", "Persona 8");
            
            Node Per9 = graphDb.createNode(NodeType.Persona);
            Per9.setProperty("Id",9);
            Per9.setProperty("Nombre", "Persona 9");
            
            Node Per10 = graphDb.createNode(NodeType.Persona);
            Per10.setProperty("Id",10);
            Per10.setProperty("Nombre", "Persona 10");
            
            Node Per11 = graphDb.createNode(NodeType.Persona);
            Per11.setProperty("Id",11);
            Per11.setProperty("Nombre", "Persona 11");
            
            Node Per12 = graphDb.createNode(NodeType.Persona);
            Per12.setProperty("Id",12);
            Per12.setProperty("Nombre", "Persona 12");
            
            Node Per13 = graphDb.createNode(NodeType.Persona);
            Per13.setProperty("Id",13);
            Per13.setProperty("Nombre", "Persona 13");
            
            Node Per14 = graphDb.createNode(NodeType.Persona);
            Per14.setProperty("Id",14);
            Per14.setProperty("Nombre", "Persona 14");
            
            
            //Se crean relaciones entre los empleados, las cuales indican que se han enviado correos
            Relationship P1P2 = Per1.createRelationshipTo(Per2,RelationType.Correos);
            //Se define cuantos correos ha mandado el empleado al otro
            P1P2.setProperty("Cantidad",3);
            
            Relationship P1P3 = Per1.createRelationshipTo(Per3,RelationType.Correos);
            P1P3.setProperty("Cantidad",2);
            
            Relationship P1P9 = Per1.createRelationshipTo(Per9,RelationType.Correos);
            P1P9.setProperty("Cantidad",6);
            
            Relationship P2P1 = Per2.createRelationshipTo(Per1,RelationType.Correos);
            P2P1.setProperty("Cantidad",5);
            
            Relationship P2P3 = Per2.createRelationshipTo(Per3,RelationType.Correos);
            P2P3.setProperty("Cantidad",8);
            
            Relationship P2P4 = Per2.createRelationshipTo(Per4,RelationType.Correos);
            P2P4.setProperty("Cantidad",2);
            
            Relationship P2P12 = Per2.createRelationshipTo(Per12,RelationType.Correos);
            P2P12.setProperty("Cantidad",1);
            
            Relationship P3P1 = Per3.createRelationshipTo(Per1,RelationType.Correos);
            P3P1.setProperty("Cantidad",5);
            
            Relationship P3P4 = Per3.createRelationshipTo(Per4,RelationType.Correos);
            P3P4.setProperty("Cantidad",2);
            
            Relationship P4P5 = Per4.createRelationshipTo(Per5,RelationType.Correos);
            P4P5.setProperty("Cantidad",5);
            
            Relationship P4P11 = Per4.createRelationshipTo(Per11,RelationType.Correos);
            P4P11.setProperty("Cantidad",2);
            
            Relationship P4P13 = Per4.createRelationshipTo(Per13,RelationType.Correos);
            P4P13.setProperty("Cantidad",3);
            
            Relationship P4P14 = Per4.createRelationshipTo(Per14,RelationType.Correos);
            P4P14.setProperty("Cantidad",7);
            
            Relationship P5P4 = Per5.createRelationshipTo(Per4,RelationType.Correos);
            P5P4.setProperty("Cantidad",2);
            
            Relationship P5P6 = Per5.createRelationshipTo(Per6,RelationType.Correos);
            P5P6.setProperty("Cantidad",6);
            
            Relationship P5P11 = Per5.createRelationshipTo(Per11,RelationType.Correos);
            P5P11.setProperty("Cantidad",4);
            
            Relationship P5P12 = Per5.createRelationshipTo(Per12,RelationType.Correos);
            P5P12.setProperty("Cantidad",3);
            
            Relationship P5P13 = Per5.createRelationshipTo(Per13,RelationType.Correos);
            P5P13.setProperty("Cantidad",7);
            
            Relationship P5P14 = Per5.createRelationshipTo(Per14,RelationType.Correos);
            P5P14.setProperty("Cantidad",9);
       
            Relationship P6P4 = Per6.createRelationshipTo(Per4,RelationType.Correos);
            P6P4.setProperty("Cantidad",6);
            
            Relationship P6P5 = Per6.createRelationshipTo(Per5,RelationType.Correos);
            P6P5.setProperty("Cantidad",2);
            
            Relationship P6P12 = Per6.createRelationshipTo(Per12,RelationType.Correos);
            P6P12.setProperty("Cantidad",7);
            
            Relationship P6P13 = Per6.createRelationshipTo(Per13,RelationType.Correos);
            P6P13.setProperty("Cantidad",7);
            
            Relationship P7P8 = Per7.createRelationshipTo(Per8,RelationType.Correos);
            P7P8.setProperty("Cantidad",12);
            
            Relationship P7P9 = Per7.createRelationshipTo(Per9,RelationType.Correos);
            P7P9.setProperty("Cantidad",13);
            
            Relationship P7P11 = Per7.createRelationshipTo(Per11,RelationType.Correos);
            P7P11.setProperty("Cantidad",1);
            
            Relationship P8P6 = Per8.createRelationshipTo(Per6,RelationType.Correos);
            P8P6.setProperty("Cantidad",3);
            
            Relationship P8P7 = Per8.createRelationshipTo(Per7,RelationType.Correos);
            P8P7.setProperty("Cantidad",14);
            
            Relationship P8P9 = Per8.createRelationshipTo(Per9,RelationType.Correos);
            P8P9.setProperty("Cantidad",21);
            
            Relationship P8P10 = Per8.createRelationshipTo(Per10,RelationType.Correos);
            P8P10.setProperty("Cantidad",2);
            
            Relationship P9P5 = Per9.createRelationshipTo(Per5,RelationType.Correos);
            P9P5.setProperty("Cantidad",4);
            
            Relationship P9P7 = Per9.createRelationshipTo(Per7,RelationType.Correos);
            P9P7.setProperty("Cantidad",12);
            
            Relationship P9P8 = Per9.createRelationshipTo(Per8,RelationType.Correos);
            P9P8.setProperty("Cantidad",23);
            
            Relationship P10P4 = Per10.createRelationshipTo(Per4,RelationType.Correos);
            P10P4.setProperty("Cantidad",9);
            
            Relationship P10P5 = Per10.createRelationshipTo(Per5,RelationType.Correos);
            P10P5.setProperty("Cantidad",7);
            
            Relationship P10P6 = Per10.createRelationshipTo(Per6,RelationType.Correos);
            P10P6.setProperty("Cantidad",1);
            
            Relationship P10P7 = Per10.createRelationshipTo(Per7,RelationType.Correos);
            P10P7.setProperty("Cantidad",1);
            
            Relationship P10P11 = Per10.createRelationshipTo(Per11,RelationType.Correos);
            P10P11.setProperty("Cantidad",5);
            
            Relationship P10P12 = Per10.createRelationshipTo(Per12,RelationType.Correos);
            P10P12.setProperty("Cantidad",4);
            
            Relationship P10P13 = Per10.createRelationshipTo(Per13,RelationType.Correos);
            P10P13.setProperty("Cantidad",8);
            
            Relationship P10P14 = Per10.createRelationshipTo(Per14,RelationType.Correos);
            P10P14.setProperty("Cantidad",7);
            
            Relationship P11P4 = Per11.createRelationshipTo(Per4,RelationType.Correos);
            P11P4.setProperty("Cantidad",4);
            
            Relationship P11P6 = Per11.createRelationshipTo(Per6,RelationType.Correos);
            P11P6.setProperty("Cantidad",1);
            
            Relationship P11P10 = Per11.createRelationshipTo(Per10,RelationType.Correos);
            P11P10.setProperty("Cantidad",1);
                      
            Relationship P11P13 = Per11.createRelationshipTo(Per13,RelationType.Correos);
            P11P13.setProperty("Cantidad",9);
            
            Relationship P11P14 = Per11.createRelationshipTo(Per14,RelationType.Correos);
            P11P14.setProperty("Cantidad",1);
            
            Relationship P12P4 = Per12.createRelationshipTo(Per4,RelationType.Correos);
            P12P4.setProperty("Cantidad",4);
            
            Relationship P12P5 = Per12.createRelationshipTo(Per5,RelationType.Correos);
            P12P5.setProperty("Cantidad",4);
            
            Relationship P12P6 = Per12.createRelationshipTo(Per6,RelationType.Correos);
            P12P6.setProperty("Cantidad",9);
            
            Relationship P12P10 = Per12.createRelationshipTo(Per10,RelationType.Correos);
            P12P10.setProperty("Cantidad",2);
            
            Relationship P12P11 = Per12.createRelationshipTo(Per11,RelationType.Correos);
            P12P11.setProperty("Cantidad",4);
            
            Relationship P12P13 = Per12.createRelationshipTo(Per13,RelationType.Correos);
            P12P13.setProperty("Cantidad",8);
            
            Relationship P12P14 = Per12.createRelationshipTo(Per14,RelationType.Correos);
            P12P14.setProperty("Cantidad",9);
            
            Relationship P13P4 = Per13.createRelationshipTo(Per4,RelationType.Correos);
            P13P4.setProperty("Cantidad",1);
            
            Relationship P13P5 = Per13.createRelationshipTo(Per5,RelationType.Correos);
            P13P5.setProperty("Cantidad",3);
            
            Relationship P13P10 = Per13.createRelationshipTo(Per10,RelationType.Correos);
            P13P10.setProperty("Cantidad",2);
            
            Relationship P13P11= Per13.createRelationshipTo(Per11,RelationType.Correos);
            P13P11.setProperty("Cantidad",3);
            
            Relationship P13P12 = Per13.createRelationshipTo(Per2,RelationType.Correos);
            P13P12.setProperty("Cantidad",2);
            
            Relationship P14P4 = Per14.createRelationshipTo(Per4,RelationType.Correos);
            P14P4.setProperty("Cantidad",7);
            
            Relationship P14P10 = Per14.createRelationshipTo(Per10,RelationType.Correos);
            P14P10.setProperty("Cantidad",6);
            
            Relationship P14P11 = Per14.createRelationshipTo(Per11,RelationType.Correos);
            P14P11.setProperty("Cantidad",8);
            
            Relationship P14P12 = Per14.createRelationshipTo(Per12,RelationType.Correos);
            P14P12.setProperty("Cantidad",3);
           
            tx.success();
        }
        //Se cierra la base de datos para guardar todos los cambios
        graphDb.shutdown();
    }
    
}