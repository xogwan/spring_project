package com.codefarm.codefarmer.entity.period;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChatPeriod is a Querydsl query type for ChatPeriod
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QChatPeriod extends EntityPathBase<ChatPeriod> {

    private static final long serialVersionUID = -1631446149L;

    public static final QChatPeriod chatPeriod = new QChatPeriod("chatPeriod");

    public final DateTimePath<java.time.LocalDateTime> chatDate = createDateTime("chatDate", java.time.LocalDateTime.class);

    public QChatPeriod(String variable) {
        super(ChatPeriod.class, forVariable(variable));
    }

    public QChatPeriod(Path<? extends ChatPeriod> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChatPeriod(PathMetadata metadata) {
        super(ChatPeriod.class, metadata);
    }

}

