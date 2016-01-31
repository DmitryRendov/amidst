package amidst.mojangapi.world.testworld.storage;

import amidst.documentation.GsonConstructor;
import amidst.documentation.Immutable;

@Immutable
public class AreaJson {
	private volatile long x;
	private volatile long y;
	private volatile long width;
	private volatile long height;

	@GsonConstructor
	public AreaJson() {
	}

	public AreaJson(long x, long y, long width, long height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getWidth() {
		return width;
	}

	public long getHeight() {
		return height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (height ^ (height >>> 32));
		result = prime * result + (int) (width ^ (width >>> 32));
		result = prime * result + (int) (x ^ (x >>> 32));
		result = prime * result + (int) (y ^ (y >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AreaJson)) {
			return false;
		}
		AreaJson other = (AreaJson) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
}
