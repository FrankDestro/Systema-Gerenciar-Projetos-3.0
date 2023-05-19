package com.management.project_managment.dto;


import java.io.Serializable;
import java.time.Instant;

import com.management.project_managment.entities.Attachment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AttachmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String url;
    private Instant date;
    private Long projectId;

    public AttachmentDTO(Attachment entity) {
        id = entity.getId();
        url = entity.getUrl();
        date = entity.getDate();
    }
}
