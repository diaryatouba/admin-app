package sn.isi.mapping;

import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import sn.isi.dto.AppRoles;
import sn.isi.entities.AppRolesEntity;

@Mapper
@SpringBootApplication
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
