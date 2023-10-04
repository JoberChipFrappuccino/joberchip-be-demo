package kr.joberchip.server.v1.user.controller.dto;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

public record UserProfileRequestDTO(
    @RequestParam String nickname, @RequestPart MultipartFile profileImage) {}
