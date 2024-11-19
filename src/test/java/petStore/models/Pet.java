package petStore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Pet{
    private int id;
    private test.java.petStore.models.Category category;
    private String name;
    private ArrayList<String> photoUrls;
    private ArrayList<test.java.petStore.models.Tag> tags;
    private String status;
}