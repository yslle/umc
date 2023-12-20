package umc.study.service.StoreService;

import umc.study.domain.Mission;
import umc.study.domain.Review;
import umc.study.web.dto.StoreRequestDTO;

public interface StoreCommandService {

    Review createReview(Long memberId, Long storeId, StoreRequestDTO.ReveiwDTO request);
    Mission createMission(Long storeId, StoreRequestDTO.MissionDTO request);
}
