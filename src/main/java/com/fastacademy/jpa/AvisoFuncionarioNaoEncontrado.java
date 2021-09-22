package com.fastacademy.jpa;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class AvisoFuncionarioNaoEncontrado {

  @ResponseBody
  @ExceptionHandler(ExcessaoFuncionarioNaoEncontrado.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(ExcessaoFuncionarioNaoEncontrado ex) {
    return ex.getMessage();
  }
}