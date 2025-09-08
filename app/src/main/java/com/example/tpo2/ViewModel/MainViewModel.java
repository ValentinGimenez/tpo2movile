package com.example.tpo2.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tpo2.Model.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<String> mutableMensaje;
    private MutableLiveData<Libro> mutableLibro;
    private final List<Libro> repositorio = new ArrayList<>();
    public MainViewModel(@NonNull Application application) {
        super(application);
        cargarRepositorio();
    }
    private void cargarRepositorio() {
        repositorio.clear();

        // 📚 J.R.R. Tolkien
        repositorio.add(new Libro("El Señor de los Anillos: La Comunidad del Anillo", "J. R. R. Tolkien", 1954, 423,
                "La primera parte de la monumental saga de la Tierra Media. Frodo Bolsón hereda el Anillo Único, una reliquia de un poder oscuro capaz de corromper a cualquiera. " +
                        "Junto a un grupo de hobbits, un mago, un enano, un elfo y hombres, emprende un viaje hacia Mordor para destruirlo antes de que Sauron lo recupere."));
        repositorio.add(new Libro("El Señor de los Anillos: Las Dos Torres", "J. R. R. Tolkien", 1954, 352,
                "La Comunidad del Anillo se ha disuelto y sus miembros toman caminos distintos. Mientras Frodo y Sam continúan hacia Mordor guiados por la extraña criatura Gollum, " +
                        "Aragorn, Legolas y Gimli se enfrentan a la guerra que se avecina en Rohan contra las fuerzas de Saruman."));
        repositorio.add(new Libro("El Señor de los Anillos: El Retorno del Rey", "J. R. R. Tolkien", 1955, 416,
                "El desenlace épico de la saga. Gondor se prepara para la batalla final contra las fuerzas de Sauron, mientras Frodo y Sam continúan su agotador camino hacia la Montaña del Destino. " +
                        "Una conclusión que define el destino de la Tierra Media."));
        repositorio.add(new Libro("El Hobbit", "J. R. R. Tolkien", 1937, 310,
                "Bilbo Bolsón, un hobbit tranquilo y hogareño, es arrastrado por Gandalf y un grupo de enanos a una aventura inesperada. " +
                        "Su objetivo: recuperar un tesoro custodiado por el dragón Smaug. Una historia de coraje, amistad y descubrimiento personal."));

        // 📚 J.K. Rowling - Harry Potter
        repositorio.add(new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", 1997, 223,
                "Harry Potter, un niño huérfano, descubre en su cumpleaños número once que es un mago. Al ingresar en Hogwarts, " +
                        "una escuela de magia, conoce a sus primeros amigos y descubre el misterio de la piedra filosofal, un objeto capaz de otorgar la inmortalidad."));
        repositorio.add(new Libro("Harry Potter y la cámara secreta", "J. K. Rowling", 1998, 251,
                "En su segundo año en Hogwarts, extraños sucesos comienzan a ocurrir: alumnos petrificados y rumores de que la Cámara Secreta ha sido abierta de nuevo. " +
                        "Harry y sus amigos deberán resolver el misterio antes de que sea demasiado tarde."));
        repositorio.add(new Libro("Harry Potter y el prisionero de Azkaban", "J. K. Rowling", 1999, 317,
                "Un peligroso fugitivo, Sirius Black, se ha escapado de la prisión de Azkaban y parece tener como objetivo a Harry. " +
                        "Mientras tanto, los dementores acechan en Hogwarts, y Harry descubre verdades sobre el pasado de su familia."));
        repositorio.add(new Libro("Harry Potter y el cáliz de fuego", "J. K. Rowling", 2000, 636,
                "Harry es elegido misteriosamente para participar en el Torneo de los Tres Magos, una competencia mágica mortal. " +
                        "Entre pruebas peligrosas y conspiraciones ocultas, Voldemort comienza a recuperar su poder."));
        repositorio.add(new Libro("Harry Potter y la Orden del Fénix", "J. K. Rowling", 2003, 766,
                "El Ministerio de Magia niega el regreso de Voldemort, mientras Harry y sus amigos forman la 'Orden del Fénix' para resistir. " +
                        "Enfrentan nuevas amenazas, un régimen autoritario en Hogwarts y la batalla en el Departamento de Misterios."));
        repositorio.add(new Libro("Harry Potter y el misterio del príncipe", "J. K. Rowling", 2005, 607,
                "Dumbledore prepara a Harry para la confrontación final con Voldemort, mientras juntos exploran los recuerdos del pasado del Señor Tenebroso. " +
                        "A la par, Draco Malfoy recibe una peligrosa misión que cambiará el destino de Hogwarts."));
        repositorio.add(new Libro("Harry Potter y las reliquias de la muerte", "J. K. Rowling", 2007, 607,
                "Harry, Ron y Hermione abandonan Hogwarts para buscar y destruir los horrocruxes de Voldemort. " +
                        "La lucha final por el futuro del mundo mágico culmina en la batalla de Hogwarts, con sacrificios, revelaciones y un cierre inolvidable."));

        // 📚 George R.R. Martin - Canción de Hielo y Fuego
        repositorio.add(new Libro("Juego de Tronos", "George R. R. Martin", 1996, 694,
                "En los Siete Reinos de Poniente, distintas casas nobles luchan por el control del Trono de Hierro. " +
                        "Traiciones, conspiraciones y alianzas marcan un escenario donde el invierno se acerca y amenazas ancestrales resurgen más allá del Muro."));
        repositorio.add(new Libro("Choque de Reyes", "George R. R. Martin", 1998, 768,
                "La guerra por el Trono de Hierro se intensifica con varios reyes proclamándose como legítimos. " +
                        "Mientras tanto, en el lejano oriente, Daenerys Targaryen inicia su camino hacia la reconquista con sus tres jóvenes dragones."));
        repositorio.add(new Libro("Tormenta de Espadas", "George R. R. Martin", 2000, 973,
                "Considerado el libro más impactante de la saga, muestra alianzas cambiantes, batallas épicas y eventos inolvidables como la Boda Roja. " +
                        "El destino de Poniente da un giro sangriento e inesperado."));
        repositorio.add(new Libro("Festín de Cuervos", "George R. R. Martin", 2005, 753,
                "Tras la guerra, los Siete Reinos quedan debilitados y fragmentados. Intrigas políticas, complots en Desembarco del Rey y el surgimiento de nuevas fuerzas marcan este capítulo más introspectivo."));
        repositorio.add(new Libro("Danza de Dragones", "George R. R. Martin", 2011, 1056,
                "Mientras los últimos herederos Targaryen y los líderes del Norte luchan por sus propios destinos, Poniente se encuentra al borde del colapso. " +
                        "Jon Nieve afronta su mayor desafío como Lord Comandante, y Daenerys intenta mantener el control sobre sus dragones y su reinado en Essos."));

        // 📚 Stephen King - algunos clásicos
        repositorio.add(new Libro("It", "Stephen King", 1986, 1138,
                "En Derry, un grupo de niños conocidos como 'El Club de los Perdedores' se enfrenta a una entidad maligna que adopta la forma de un payaso llamado Pennywise. " +
                        "Años más tarde, deberán regresar como adultos para cumplir la promesa de destruirlo definitivamente."));
        repositorio.add(new Libro("El resplandor", "Stephen King", 1977, 688,
                "Jack Torrance acepta un trabajo como cuidador de invierno en el solitario Hotel Overlook. " +
                        "Lleva a su familia con él, pero el aislamiento y las fuerzas sobrenaturales del lugar comienzan a empujarlo hacia la locura, poniendo en peligro a su esposa e hijo."));
        repositorio.add(new Libro("Carrie", "Stephen King", 1974, 253,
                "Carrie White es una adolescente tímida y marginada que descubre tener poderes telequinéticos. " +
                        "Tras años de abusos y humillaciones, un evento trágico en el baile de graduación desencadena una ola de destrucción inolvidable."));
        repositorio.add(new Libro("Misery", "Stephen King", 1987, 370,
                "Un escritor famoso sufre un accidente y es rescatado por Annie Wilkes, su 'fan número uno'. " +
                        "Pronto descubre que su salvadora es en realidad una mujer perturbada que lo mantiene prisionero para obligarlo a reescribir su última novela."));
        repositorio.add(new Libro("Cementerio de animales", "Stephen King", 1983, 560,
                "Louis Creed y su familia descubren un antiguo cementerio en el bosque cercano a su nueva casa. " +
                        "Cuando la tragedia golpea a la familia, Louis conocerá el oscuro secreto del lugar: lo que muere allí no regresa igual."));
        repositorio.add(new Libro("La torre oscura: El pistolero", "Stephen King", 1982, 224,
                "El inicio de la saga de Roland Deschain, el último pistolero, que viaja a través de un mundo en decadencia persiguiendo al Hombre de Negro. " +
                        "Una mezcla única de fantasía, western y terror que da comienzo a la obra magna de King."));
    }


    public LiveData<String> getMutableMensaje(){
        if (mutableMensaje == null){
            mutableMensaje = new MutableLiveData<>();
        }
        return mutableMensaje;
    }
    public LiveData<Libro> getMutableLibro(){
        if(mutableLibro == null){
            mutableLibro = new MutableLiveData<>();
            }
        return mutableLibro;
    }
    public void buscar(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            if (mutableMensaje != null) mutableMensaje.setValue("Ingresá un título.");
            if (mutableLibro != null) mutableLibro.setValue(null);
            return;
        }

        String tituloBuscado = titulo.trim().toLowerCase();

        for (Libro l : repositorio) {
            if (l.getTitle() != null && l.getTitle().toLowerCase().equals(tituloBuscado)) {
                if (mutableLibro != null) mutableLibro.setValue(l);
                if (mutableMensaje != null) mutableMensaje.setValue(null);
                return;
            }
        }

        if (mutableMensaje != null) mutableMensaje.setValue("No se encontró: " + titulo);
        if (mutableLibro != null) mutableLibro.setValue(null);
    }
}
