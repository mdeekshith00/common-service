package com.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchResultDTO {
    private PageResponse<SearchDonorDTO> donors;
    private PageResponse<SearchBloodInventoryDTO> bloodBanks;
    private PageResponse<SearchHospitalInventoryDTO> hospitals;

}
