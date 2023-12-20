package umc.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.MemberConverter;
import umc.study.converter.MemberMissionConverter;
import umc.study.domain.Member;
import umc.study.domain.mapping.MemberMission;
import umc.study.service.MemberService.MemberCommandService;
import umc.study.validation.annotation.ExistMember;
import umc.study.validation.annotation.ExistMission;
import umc.study.web.dto.MemberRequestDTO;
import umc.study.web.dto.MemberResponseDTO;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }

    @PostMapping("/{missionId}/missions")
    public ApiResponse<MemberResponseDTO.MemberMissionResultDTO> participateMission(
            @ExistMission @PathVariable(name = "missionId") Long missionId,
            @ExistMember @RequestParam(name = "memberId") Long memberId){
        MemberMission memberMission = memberCommandService.createMemberMission(missionId, memberId);
        return ApiResponse.onSuccess(MemberMissionConverter.toCreateMemberMissionResultDTO(memberMission));
    }
}