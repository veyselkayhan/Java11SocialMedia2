package com.bilgeadam.repository.entity;

import com.bilgeadam.utility.enums.EStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UserProfile extends BaseEntity{

    @Id
    private String id;
    private Long authId;
    private String username;
    private String email;
    private String phone;
    private String avatarUrl;
    private String address;
    private String about;

    @Builder.Default
    private EStatus status = EStatus.PENDING;
}
