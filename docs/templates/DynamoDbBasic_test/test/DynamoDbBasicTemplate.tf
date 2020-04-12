

resource "aws_dynamodb_table" "basicDynamodbTable"   {
    
      attribute { 
        name =  "UserId"
        type =  "S"
      }
      attribute { 
        name =  "GameTitle"
        type =  "S"
      }
      attribute { 
        name =  "TopScore"
        type =  "N"
      }
    billing_mode =  "PROVISIONED"
    
      global_secondary_index { 
        hash_key =  "GameTitle"
        name =  "GameTitleIndex"
        non_key_attributes =  [  "UserId"]
        projection_type =  "INCLUDE"
        range_key =  "TopScore"
        read_capacity =  2
        write_capacity =  2
      }
    hash_key =  "UserId"
    name =  "GameScores1586715315331"
    range_key =  "GameTitle"
    read_capacity =  2
    tags = {
        "Name" =  "dynamodb-table-1"
        "Environment" =  "production"
      }
    write_capacity =  2
  }


output "tableArn"   {
    value =  aws_dynamodb_table.basicDynamodbTable.arn
  }


output "tableId"   {
    value =  aws_dynamodb_table.basicDynamodbTable.id
  }
    
    
  
