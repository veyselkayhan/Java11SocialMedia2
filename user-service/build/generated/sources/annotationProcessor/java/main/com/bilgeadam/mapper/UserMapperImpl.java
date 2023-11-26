package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.UserCreateRequestDto;
import com.bilgeadam.rabbitmq.model.RegisterModel;
import com.bilgeadam.repository.entity.UserProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-26T21:58:44+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserProfile fromCreateRequestToUser(UserCreateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder<?, ?> userProfile = UserProfile.builder();

        userProfile.authId( dto.getAuthId() );
        userProfile.username( dto.getUsername() );
        userProfile.email( dto.getEmail() );

        return userProfile.build();
    }

    @Override
    public UserProfile fromRegisterModelToUserProfile(RegisterModel model) {
        if ( model == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder<?, ?> userProfile = UserProfile.builder();

        userProfile.authId( model.getAuthId() );
        userProfile.username( model.getUsername() );
        userProfile.email( model.getEmail() );

        return userProfile.build();
    }

    @Override
    public UserCreateRequestDto fromRegisterModelToUserCreateDto(RegisterModel model) {
        if ( model == null ) {
            return null;
        }

        UserCreateRequestDto.UserCreateRequestDtoBuilder userCreateRequestDto = UserCreateRequestDto.builder();

        userCreateRequestDto.authId( model.getAuthId() );
        userCreateRequestDto.username( model.getUsername() );
        userCreateRequestDto.email( model.getEmail() );

        return userCreateRequestDto.build();
    }
}
