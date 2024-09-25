package com.sboard.dto;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDTO {

    private int no;
    private int parent;
    private String content;
    private String writer;
    private String regip;
    private LocalDateTime rdate; // Changed to LocalDateTime for better handling of date-time values

    private UserDTO user; // Assuming UserDTO is already defined in your project
}
