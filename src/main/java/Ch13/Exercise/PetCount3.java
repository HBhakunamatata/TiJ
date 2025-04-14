package Ch13.Exercise;

import Ch13.Exercise.pets.LiteralPetCreator;
import Ch13.Exercise.pets.Pet;
import Ch13.Exercise.pets.Pets;
import net.mindview.util.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetCount3 {
    static class PetCounter extends LinkedHashMap
        <Class<? extends Pet>, Integer> {

        public PetCounter () {
            super( MapData.map(LiteralPetCreator.allTypes, 0) );
        }

        public void conut(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pairs : entrySet()) {
                if ( pairs.getKey().isInstance(pet) ) {
                    put( pairs.getKey(), pairs.getValue() + 1 );
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                str.append(pair.getKey().getSimpleName());
                str.append(" = ");
                str.append(pair.getValue());
                str.append(", ");
            }
            str.delete(str.length()-2, str.length());
            str.append("}");
            return str.toString();
        }

        public static void main(String[] args) {
            PetCounter petCounter = new PetCounter();
            for ( Pet pet : Pets.createList(20) ) {
                petCounter.conut(pet);
            }
            System.out.println(petCounter);
        }
    }
}
