package model.MARK_II;

/**
 * Provides the minimal behaviors for a Cell.
 *
 * @author Quinn Liu (quinnliu@vt.edu)
 * @author Michael Cogswell (cogswell@vt.edu)
 * @version MARK II | June 8, 2013
 */
public class Cell {
    protected boolean isActive;

    public Cell() {
	this.isActive = false;
    }

    public boolean getActiveState() {
	return this.isActive;
    }

    public void setActiveState(boolean isActive) {
	this.isActive = isActive;
    }
}