package net.javaguides.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.entity.Organization;
import net.javaguides.organizationservice.repository.OrganizationRepository;
import net.javaguides.organizationservice.service.OrganizationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;
    private ModelMapper modelMapper;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = modelMapper.map(organizationDto, Organization.class);
        Organization savedOrganization = organizationRepository.save(organization);
        OrganizationDto savedOrganizationDto = modelMapper.map(savedOrganization, OrganizationDto.class);
        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization getOrganization = organizationRepository.findByOrganizationCode(organizationCode);
        OrganizationDto getOrganizationDto = modelMapper.map(getOrganization, OrganizationDto.class);
        return getOrganizationDto;
    }


}
