public class AnimalTeste {

    public static void main(String[] args) {
        
        Animal gato = new Animal("Gato", "Sabrina", 7 , "Miau");
        System.out.println(gato.toString());

        Animal dino = new Animal("Dinossauro", "Léo", 300 , "Rawh");
        System.out.println(dino.toString());

        Animal cavalo = new Animal("Cavalo", "Lauro", 15 , "rilinchin");
        System.out.println(cavalo.toString());

        Animal cachorro = new Animal("Cachorro", "Nego", 7 , "Auau");
        System.out.println(cachorro.toString());

    }

}

    //Acessando e atribuindo valores pelos métodos getters e setters

        //gato.setTipo("gato");
        // System.out.println(gato.getTipo());

        //gato.setNome("Sabrina");
        // System.out.println(gato.getNome());

        //gato.setIdade(7);
        // System.out.println(gato.getIdade());

        //gato.setBarulho("miau");
        // System.out.println(gato.getBarulho());