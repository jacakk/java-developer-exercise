package pl.programistazacny.javadeveloperexercise.adapter.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@DynamoDBTable(tableName = PaymentDynamoDB.TABLE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDynamoDB {
    public static final String TABLE = "Payment";

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private UUID id;

    @DynamoDBAttribute
    private BigDecimal amount;

    @DynamoDBAttribute
    private String currency;

    @DynamoDBAttribute
    private UUID userId;

    @DynamoDBAttribute
    private String targetAccountNumber;
}

