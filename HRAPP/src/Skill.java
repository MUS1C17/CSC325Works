abstract class Skill {

    //properties
    protected String skillName;
    protected String skillType;
    protected int skillLevel;

    //Constructor class
    public Skill(String skill, String type, int level)
    {
        this.skillName = skill;
        this.skillType = type;
        this.skillLevel = level;
    }

    //Skill getter method
    public String getSkill()
    {
        return skillName;
    }

    //Skill type getter method
    public String getSkillType()
    {
        return skillType;
    }

    //Skill level getter method
    public int getSkillLevel()
    {
        return skillLevel;
    }

    //Method to print Skill name, skill type and skill level
    public void identifySkill()
    {
        System.out.println(skillType + " skill of " + skillName + " has a level of " + skillLevel);
    }
}   
