package com.codefarm.codefarmer.entity.inquire;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInquire is a Querydsl query type for Inquire
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInquire extends EntityPathBase<Inquire> {

    private static final long serialVersionUID = -624312467L;

    public static ConstructorExpression<Inquire> create(Expression<Long> inquireId, Expression<String> inquireQTitle, Expression<String> inquireQContent, Expression<com.codefarm.codefarmer.type.Status> inquireStatus, Expression<? extends com.codefarm.codefarmer.entity.member.Member> member) {
        return Projections.constructor(Inquire.class, new Class<?>[]{long.class, String.class, String.class, com.codefarm.codefarmer.type.Status.class, com.codefarm.codefarmer.entity.member.Member.class}, inquireId, inquireQTitle, inquireQContent, inquireStatus, member);
    }

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInquire inquire = new QInquire("inquire");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> inquireId = createNumber("inquireId", Long.class);

    public final StringPath inquireQContent = createString("inquireQContent");

    public final StringPath inquireQTitle = createString("inquireQTitle");

    public final EnumPath<com.codefarm.codefarmer.type.Status> inquireStatus = createEnum("inquireStatus", com.codefarm.codefarmer.type.Status.class);

    public final com.codefarm.codefarmer.entity.member.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QInquire(String variable) {
        this(Inquire.class, forVariable(variable), INITS);
    }

    public QInquire(Path<? extends Inquire> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInquire(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInquire(PathMetadata metadata, PathInits inits) {
        this(Inquire.class, metadata, inits);
    }

    public QInquire(Class<? extends Inquire> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
    }

}

