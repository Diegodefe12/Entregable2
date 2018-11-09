package com.example.defel.entregable_android;

import java.util.ArrayList;
import java.util.List;

public class RecetasProvider {

    public static List<Receta> cargarRecetas() {
        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta(R.drawable.sandwich, "Sandwich de la casa", "Una pieza de pan, 100 grs de queso de máquina, 100 grs de jamón cocido (fiambre a elección), mayones", "Rebanar el pan, de modo que queden 2 mitades. A una de las mitades, untarla con mayonesa a gusto. Colocar una feta de queso y una feta de fiambre encima de este. Cerrar con la mitad de pan restante."));
        recetas.add(new Receta(R.drawable.mostacholes, "Mostacholes al dente", "Un paquete de fideos (estilo mostachol), agua, manteca, sal, queso rallado (a gusto)", "Hervir un litros de agua aproximadamente en una hoya. Una vez que hierva, colocar una pizca de sal y los fideos en su interior. Luego de 7' retirarlos con un colador. Servirlos en el plato mezclándolos con una rebanada de manteca. Luego rociar el plato con queso rallado (cantidad a gusto)"));
        recetas.add(new Receta(R.drawable.milanesa_doble_caballo, "Milanesa Doble Caballo", "200 grs de milanesa rebosada, 2 huevos, aceite, 2 papas", "En una sartén poner a calentar aceite. Luego colocar una porcion de milanesa en el recipiente. Una vezque tome color, darla vuelta. Luego que tome color del otro lado retirarla y emplatarla. Luego rebanar las dos papas en juiana y colocarlas en la sarten, para retirarlas luego de aproximadamente 10 minutos. Retirarlas. Para aprovechar el mismo aceite en épocas de crisis, romper dos huevos y colocarlso en la misma. Una vez que estén cocidos, retirarlos y colocarlos encima de la milanesa."));
        recetas.add(new Receta (R.drawable.revuelto_gramajo,"Revuelto de Gramajo", "3/4 kg papas, 5 huevos, 100 g jamón cocido, 100 g panceta, arvejas (congeladas o de lata) a gusto, 1 cebolla mediana, 1 ají rojo chico medio, Sal y pimienta, Aceite","Rehogar la cebolla y el ají, salar, colocar en un bol y agregarle las arvejas. Dorar un poquito el jamón y la panceta con un poquito de aceite, agregarlo al bol. Pelar, cortar a gusto las papas, (yo las corte en bastones), colocarlas en un bol con agua y algunos hielos, luego secarlas y freírlas, salarlas. Agregar las papas en el bol donde teníamos los otros ingredientes. Mezclar todo suavemente, colocar en un sartén, calentar todo, e ir revolviendo. Batir un poco los huevos, salar y salpimentar, agregar a la sartén y cocinar, no mucho para que no se seque el huevo, tiene que quedar jugoso. Las medidas pueden variar a gusto."));
        recetas.add(new Receta(R.drawable.ensalada,"Lunes, arranco la dieta","320 g de lentejas pardinas cocidas, 50 g de col, 50 g de judías verdes, 1 zanahoria, 1 cebolleta y 2 tomates, ½ pimiento rojo y 1 amarillo, 1 limón, 2 cucharadas de miel, 1 cucharadita de comino molido, 2 ramitas de cilantro, ½ dl de aceite de oliva, sal y pimienta negra.","Preparar las hortalizas. En primer lugar, raspa la zanahoria y limpia la cebolleta, y lava ambas. Luego, limpia y lava los pimientos y la col. Y córtalas todas en juliana. Por último, lava los tomates y córtalos en tiras eliminando las semillas. Cocer las judías. Despúntalas, lávalas, córtalas en juliana y cuécelas durante unos 5 minutos en agua salada. Y una vez cocidas, refréscalas en agua fría y escúrrelas. Hacer la vinagreta. En un bol, mezcla el zumo del limón junto la miel, el comino, y el aceite. Montar la ensalada. Enjuaga las lentejas cocidas y escúrrelas. Mézclalas con las verduras, salpimienta y riega con la vinagreta de miel y limón. Y para decorar, añade unas hojas de cilantro lavadas."));
        return recetas;
    }
}
