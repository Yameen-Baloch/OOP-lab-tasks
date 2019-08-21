class InvalidAgeException extends Exception{
    
    InvalidAgeException(String s)
    {
        super(s);
    }

}
class VotingMachine
{
    String[] names;
    int votes[];
    VotingMachine(String[] names)
    {
        this.names = new String[names.length];
        this.votes = new int[names.length];
    }
    void addCandidates(String[] names)
    {
        this.names=names;
    }
    void castVote(int voterAge, String voteToCandidate)throws InvalidAgeException{
        if(voterAge < 18){
            throw new InvalidAgeException("Age Is Not Valid To Vote");
        }
        else{
            for(int i=0;i<names.length;i++)
            {
                if(voteToCandidate.equals(names[i]))
                {
                    votes[i]++;
                }
            }
        }
    }
    void printResults()
    {
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]+" Has Got "+votes[i]+" Votes!");
        }
    }
    public static void main(String args[]){
        try{
             String[] names = {"Yameen", "Talha", "YAsir", "Mubashir", "Ibrahim", "Babar"};
             VotingMachine votingmachine = new VotingMachine(names);
             votingmachine.addCandidates(names);
             votingmachine.castVote(23, "Yameen");
             votingmachine.printResults();

        }
        catch(InvalidAgeException s){
            System.out.println("Invalid Age "+s);
        }
    }

}