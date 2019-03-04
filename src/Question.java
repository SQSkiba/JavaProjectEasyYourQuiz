public class Question {
    public String [] question = new String [10];
    public int [] answers = new int[10];

    public Question (){
        makeQuestions();

    }

    public void makeQuestions(){
        question[0] = "On a scale of 1-5 how much do you smoke?";
        question[1] = "On a scale of 1-5, how would your rate your exersize? ";
        question[2] = "On a scale of 1-5, how would you rate the sleep quality you get? ";
        question[3] = "On a scale of 1-5 how would you rate the healthiness of your meals? ";
        question[4] = "On a scale of 1-5 how social are you?";
        question[5] = "On a scale of 1-5 rate your happiness! ";
        question[6] = "On a scale of 1-5 how much water do you drink on a daily basis?";
        question[7] = "On a scale of 1-5 how much do you read?";
        question[8] = "On a scale of 1-5 how much do you spend time outside?";
        question[9] = "On a scale of 1-5 how supportive are your friends?";
    }

    public int evaluate(){
        int sum = 0;
        for(int i=0; i<answers.length; i++){
            int age = answers[i];
            sum = sum + age;
        }
        return sum+40;
    }

}

