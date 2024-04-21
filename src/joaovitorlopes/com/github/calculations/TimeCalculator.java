package joaovitorlopes.com.github.calculations;

import joaovitorlopes.com.github.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void include(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
