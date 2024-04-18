package test.home_work_4;

import home_work_4.DataContainerString;

import org.junit.jupiter.api.*;

public class ContainerTest {

    @DisplayName("Добавление не NULL в контейнер")
    @Test
    public void testAddNotNull(){
        DataContainerString container = new DataContainerString(new String[0]);
        int index = container.add("Привет");
        String answer = container.get(index);

        Assertions.assertEquals(answer,"Привет");
    }
    @Test
    public void testAddNull(){
        DataContainerString container = new DataContainerString(new String[0]);
        int index = container.add(null);

        Assertions.assertEquals(-1,index);
    }

    @Test
    public void testDeleteByIndex(){
        DataContainerString container = new DataContainerString(new String[0]);
        int index = container.add("Привет");
        container.delete(index);
        String answer = container.get(index);

        Assertions.assertEquals(answer,null);
    }

    @Test
    public void testDeleteByItem(){
        DataContainerString container = new DataContainerString(new String[0]);
        int index = container.add("Привет");
        container.delete("Привет");
        String answer = container.get(index);

        Assertions.assertEquals(answer,null);
    }
}


