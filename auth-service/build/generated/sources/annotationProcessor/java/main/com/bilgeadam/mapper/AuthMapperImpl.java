package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.dto.request.UserCreateRequestDto;
import com.bilgeadam.dto.response.RegisterResponseDto;
import com.bilgeadam.rabbitmq.model.RegisterMailModel;
import com.bilgeadam.rabbitmq.model.RegisterModel;
import com.bilgeadam.repository.entity.Auth;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-26T21:29:15+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class AuthMapperImpl implements AuthMapper {

    @Override
    public Auth fromRegisterRequestToAuth(RegisterRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Auth.AuthBuilder<?, ?> auth = Auth.builder();

        auth.username( dto.getUsername() );
        auth.password( dto.getPassword() );
        auth.email( dto.getEmail() );

        return auth.build();
    }

    @Override
    public RegisterResponseDto fromAuthToRegisterResponse(Auth auth) {
        if ( auth == null ) {
            return null;
        }

        RegisterResponseDto.RegisterResponseDtoBuilder registerResponseDto = RegisterResponseDto.builder();

        registerResponseDto.id( auth.getId() );
        registerResponseDto.username( auth.getUsername() );
        registerResponseDto.activationCode( auth.getActivationCode() );

        return registerResponseDto.build();
    }

    @Override
    public UserCreateRequestDto fromAuthToUserCreateRequestDto(Auth auth) {
        if ( auth == null ) {
            return null;
        }

        UserCreateRequestDto.UserCreateRequestDtoBuilder userCreateRequestDto = UserCreateRequestDto.builder();

        userCreateRequestDto.authId( auth.getId() );
        userCreateRequestDto.username( auth.getUsername() );
        userCreateRequestDto.email( auth.getEmail() );

        return userCreateRequestDto.build();
    }

    @Override
    public RegisterModel fromAuthToRegisterModel(Auth auth) {
        if ( auth == null ) {
            return null;
        }

        RegisterModel.RegisterModelBuilder registerModel = RegisterModel.builder();

        registerModel.authId( auth.getId() );
        registerModel.username( auth.getUsername() );
        registerModel.email( auth.getEmail() );

        return registerModel.build();
    }

    @Override
    public RegisterMailModel fromAuthToRegisterMailModel(Auth auth) {
        if ( auth == null ) {
            return null;
        }

        RegisterMailModel.RegisterMailModelBuilder registerMailModel = RegisterMailModel.builder();

        registerMailModel.email( auth.getEmail() );
        registerMailModel.username( auth.getUsername() );
        registerMailModel.activationCode( auth.getActivationCode() );

        return registerMailModel.build();
    }
}
