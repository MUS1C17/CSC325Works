public class MainTest {
    public static void main(String[] args)
    {

        //Create an instance of each skill class
        HardSkill hardSkill = new HardSkill("Programming", "Hard", 8);
        SoftSkill softSkill = new SoftSkill("Communication", "Soft", 9);
        GiftSkill giftSkill = new GiftSkill("Mercy", "Gift", 10);
        TalentSkill talentSkill = new TalentSkill("Leadership", "Talent", 5);

        //Print skill name, skill type and level for each class
        hardSkill.identifySkill();
        softSkill.identifySkill();
        giftSkill.identifySkill();
        talentSkill.identifySkill();
    }
}
