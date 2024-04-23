import java.util.*;

class Coach {
    private String name;
    private List<Integer> ratings;

    public Coach(String name) {
        this.name = name;
        this.ratings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }
}

class Learner {
    private String name;
    private String gender;
    private int age;
    private String emergencyContact;
    private String gradeLevel;
    private String review;
    private int rating;
    private String bookingID;
    private String status;

    public Learner(String name, String gender, int age, String emergencyContact, String gradeLevel) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.emergencyContact = emergencyContact;
        this.gradeLevel = gradeLevel;
        this.review = "";
        this.rating = 0;
        this.bookingID = "";
        this.status = "booked";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class SwimmingLesson {
    private String grade;
    private String timeSlot;
    private int capacity;
    private List<Learner> learners;
    private Coach coach;

    public SwimmingLesson(String grade, String timeSlot, int capacity, Coach coach) {
        this.grade = grade;
        this.timeSlot = timeSlot;
        this.capacity = capacity;
        this.learners = new ArrayList<>();
        this.coach = coach;
    }

    public String getGrade() {
        return grade;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Learner> getLearners() {
        return learners;
    }

    public Coach getCoach() {
        return coach;
    }

    public int getVacancies() {
        return capacity - learners.size();
    }

    public boolean addLearner(Learner learner) {
        if (!learners.contains(learner) && learners.size() < capacity) {
            learners.add(learner);
            return true;
        }
        return false;
    }

    public boolean removeLearner(Learner learner) {
        return learners.remove(learner);
    }
}
