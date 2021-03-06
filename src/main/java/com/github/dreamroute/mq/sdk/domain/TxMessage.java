package com.github.dreamroute.mq.sdk.domain;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消息表
 * 
 * @author w.dehai
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tx_message")
public class TxMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String topic;
    private String tag;
    private String body;
    private Timestamp createTime;

}
