package work.domain;

import java.util.*;
import lombok.*;
import work.domain.*;
import work.infra.AbstractEvent;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private Integer size;
}
