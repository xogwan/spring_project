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
 * QInquireAnswer is a Querydsl query type for InquireAnswer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInquireAnswer extends EntityPathBase<InquireAnswer> {

    private static final long serialVersionUID = -1586174581L;

    public static ConstructorExpression<InquireAnswer> create(Expression<String> inquireAnswer, Expression<? extends Inquire> inquire) {
        return Projections.constructor(InquireAnswer.class, new Class<?>[]{String.class, Inquire.class}, inquireAnswer, inquire);
    }

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInquireAnswer inquireAnswer1 = new QInquireAnswer("inquireAnswer1");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final QInquire inquire;

    public final StringPath inquireAnswer = createString("inquireAnswer");

    public final NumberPath<Long> inquireAnswerId = createNumber("inquireAnswerId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QInquireAnswer(String variable) {
        this(InquireAnswer.class, forVariable(variable), INITS);
    }

    public QInquireAnswer(Path<? extends InquireAnswer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInquireAnswer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInquireAnswer(PathMetadata metadata, PathInits inits) {
        this(InquireAnswer.class, metadata, inits);
    }

    public QInquireAnswer(Class<? extends InquireAnswer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.inquire = inits.isInitialized("inquire") ? new QInquire(forProperty("inquire"), inits.get("inquire")) : null;
    }

}

