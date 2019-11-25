package tech.bilian.zhang.spark.sparksql;

import org.apache.spark.sql.SparkSession;

public class JavaRDD2DatasetTest {

    public static void main(String[] args){


    }

    public static SparkSession getSparkSession(){
        SparkSession spark = SparkSession.builder()
                .appName("spark sql test")
                .master("local")
                .getOrCreate();

        return spark;
    }



}
