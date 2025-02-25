package inputoutput.animalserializable;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AnimalDeserializer {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bis)) {

            int size = ois.readInt();
            if (size < 0) {
                throw new IllegalArgumentException("Некорректное количество животных");
            }

            Animal[] animals = new Animal[size];
            for (int i = 0; i < size; i++) {
                Object obj = ois.readObject();
                if (!(obj instanceof Animal)) {
                    throw new IllegalArgumentException("Некорректный тип животного");
                }
                animals[i] = (Animal) obj;
            }
            return animals;

        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException("Ошибка десериализации", e);
        }
    }
}
