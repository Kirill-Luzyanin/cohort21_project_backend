package de.ait.gethelp.advices;

import de.ait.gethelp.dto.StandardResponseDto;
import de.ait.gethelp.exceptions.BadDataException;
import de.ait.gethelp.exceptions.ConflictException;
import de.ait.gethelp.exceptions.ForbiddenException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import de.ait.gethelp.exceptions.NotFoundException;

@Slf4j
@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponseDto> handleNotFound(NotFoundException ex) {
        log.error(ex.toString());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(StandardResponseDto.builder()
                        .message(ex.getMessage())
                        .status(HttpStatus.NOT_FOUND.value())
                        .build());
    }

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<StandardResponseDto> handleForbidden(ForbiddenException ex) {
        log.error(ex.toString());
        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                .body(StandardResponseDto.builder()
                        .message(ex.getMessage())
                        .status(HttpStatus.FORBIDDEN.value())
                        .build());
    }

    @ExceptionHandler(BadDataException.class)
    public ResponseEntity<StandardResponseDto> handleBadData(BadDataException ex) {
        log.error(ex.toString());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(StandardResponseDto.builder()
                        .message(ex.getMessage())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .build());
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<StandardResponseDto> handleConflict(ConflictException ex) {
        log.error(ex.toString());
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(StandardResponseDto.builder()
                        .message(ex.getMessage())
                        .status(HttpStatus.CONFLICT.value())
                        .build());
    }
}
