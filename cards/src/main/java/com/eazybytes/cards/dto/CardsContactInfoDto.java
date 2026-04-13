package com.eazybytes.cards.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
@Data
@ConfigurationProperties(prefix = "cards")
public class CardsContactInfoDto{

    String message;
    Map<String, String> contactDetails;
    List<String> onCallSupport;
}