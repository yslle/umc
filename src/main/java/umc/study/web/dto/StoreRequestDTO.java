package umc.study.web.dto;

import lombok.Getter;
import umc.study.validation.annotation.ExistCategories;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StoreRequestDTO {

    @Getter
    public static class ReveiwDTO{
        @NotBlank
        String title;
        @NotNull
        Float rating;
        @NotBlank
        String content;
    }

    @Getter
    public static class MissionDTO {
        @NotNull
        Integer reward;
        @NotBlank
        String content;
    }
}